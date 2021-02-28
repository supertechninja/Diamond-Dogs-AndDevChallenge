/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.Sex
import com.example.androiddevchallenge.data.listOfPuppies
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

class MainActivity : AppCompatActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                AppContent()
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun AppContent() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { PuppyList(navController) }
        composable("detail/{puppy}") { backstackEntry ->
            PuppyDetail(
                navController = navController,
                puppyName = backstackEntry.arguments?.getString("puppy")
            )
        }
    }
}

// Start building your app here!
@ExperimentalFoundationApi
@Composable
fun PuppyList(navController: NavHostController) {
    Scaffold(
        content = {
            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                modifier = Modifier.padding(horizontal = 12.dp),
                content = {
                    listOfPuppies.forEach { puppy ->
                        item {
                            var showCardDetail by remember { mutableStateOf(false) }
                            Card(
                                elevation = 8.dp,
                                backgroundColor = Color.DarkGray,
                                modifier = Modifier
                                    .width(150.dp)
                                    .wrapContentHeight()
                                    .padding(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 8.dp)
                                    .clip(RoundedCornerShape(10))
                                    .pointerInput(Unit) {
                                        detectTapGestures(
                                            onLongPress = {
                                                showCardDetail = true
                                            },
                                            onTap = {
                                                navController.navigate("detail/${puppy.name}")
                                            }
                                        )
                                    }
                            ) {

                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Card(
                                        elevation = 20.dp,
                                        modifier = Modifier
                                            .width(150.dp)
                                            .height(150.dp)
                                            .padding(4.dp)
                                            .clip(CutCornerShape(50))
                                            .border(
                                                2.dp,
                                                MaterialTheme.colors.primary,
                                                CutCornerShape(50)
                                            )
                                            .border(
                                                5.dp,
                                                Color.DarkGray,
                                                CutCornerShape(50)
                                            )

                                            .pointerInput(Unit) {
                                                detectTapGestures(
                                                    onLongPress = {
                                                        showCardDetail = true
                                                    }
                                                )
                                            }
                                    ) {
                                        Box(
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            CoilImage(
                                                data = puppy.profilePic,
                                                contentDescription = "",
                                                modifier = Modifier.fillMaxSize(),
                                                contentScale = ContentScale.Crop,
                                            )

                                        }
                                    }

                                    Row(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .fillMaxWidth(),
                                        verticalAlignment = Alignment.Bottom,
                                        horizontalArrangement = Arrangement.Center
                                    ) {
                                        Column(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(bottom = 8.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalArrangement = Arrangement.Center,
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Text(
                                                    text = puppy.name,
                                                    color = Color.White,
                                                    maxLines = 1,
                                                    modifier = Modifier.padding(4.dp, 4.dp),
                                                    style = MaterialTheme.typography.h6,
                                                    textAlign = TextAlign.Center
                                                )

                                                val sexIcon = if (puppy.sex == Sex.Male)
                                                    "https://icon-library.com/images/male-gender-icon/male-gender-icon-14.jpg" else
                                                    "https://static.thenounproject.com/png/390695-200.png"


                                                CoilImage(
                                                    data = sexIcon,
                                                    contentDescription = "",
                                                    modifier = Modifier
                                                        .requiredSize(26.dp)
                                                        .padding(2.dp, 2.dp),
                                                    colorFilter = if (puppy.sex == Sex.Female) ColorFilter.tint(
                                                        Color(0xFFFFC0CB)
                                                    ) else ColorFilter.tint(Color(0xFF89CFF0)),
                                                    contentScale = ContentScale.Fit,
                                                )
                                            }

                                            Text(
                                                text = puppy.breed,
                                                color = Color.White,
                                                maxLines = 1,
                                                modifier = Modifier
                                                    .padding(2.dp, 2.dp)
                                                    .fillMaxWidth(),
                                                style = MaterialTheme.typography.body1,
                                                textAlign = TextAlign.Center
                                            )

                                            Text(
                                                text = puppy.age,
                                                color = Color.White,
                                                maxLines = 1,
                                                modifier = Modifier
                                                    .padding(2.dp, 2.dp)
                                                    .fillMaxWidth(),
                                                style = MaterialTheme.typography.body2,
                                                textAlign = TextAlign.Center
                                            )
                                        }

                                    }
                                }
                            }
                        }

                    }
                })
        },
        topBar = {
            TopAppBar(title = {
                Text(
                    "Diamond Dogs"
                )
            })
        })
}

@Composable
fun PuppyDetail(navController: NavHostController, puppyName: String?) {
    val puppy = listOfPuppies.find { it.name == puppyName }

    Scaffold(content = {
        Column(modifier = Modifier.fillMaxSize()) {
            Box() {
                CoilImage(
                    data = puppy!!.profilePic,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    contentScale = ContentScale.Fit,
                )

                TopAppBar(
                    backgroundColor = Color(0x66000000),
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Image(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back",
                                colorFilter = ColorFilter.tint(Color.White)
                            )
                        }
                    },
                    elevation = 0.dp,
                    title = {
                        Text(
                            puppy!!.name
                        )
                    })
            }

            var selectTabIndex by remember { mutableStateOf(0) }
            TabRow(
                selectedTabIndex = selectTabIndex,
                backgroundColor = MaterialTheme.colors.primary,
                modifier = Modifier.requiredHeight(56.dp),
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        Modifier.tabIndicatorOffset(tabPositions[selectTabIndex]),
                        height = 3.dp,
                        color = Color.White
                    )
                }
            ) {
                Tab(selected = selectTabIndex == 0, onClick = { selectTabIndex = 0 }) {
                    Text(
                        text = "Bio",
                        style = MaterialTheme.typography.button,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }

                Tab(selected = selectTabIndex == 1, onClick = { selectTabIndex = 1 }) {
                    Text(
                        text = "Stats",
                        style = MaterialTheme.typography.button,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }

                Tab(selected = selectTabIndex == 1, onClick = { selectTabIndex = 1 }) {
                    Text(
                        text = "History",
                        style = MaterialTheme.typography.button,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }

            when (selectTabIndex) {
                0 -> {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = puppy!!.bio,
                            color = Color.White,
                            modifier = Modifier
                                .padding(2.dp, 2.dp)
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.body1,
                        )
                    }
                }
                1 -> {
                    Column() {
                        Text(
                            text = puppy!!.birthdate,
                            color = Color.White,
                            maxLines = 1,
                            modifier = Modifier
                                .padding(2.dp, 2.dp)
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.body1,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }


        }

    }, floatingActionButton = {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            shape = CutCornerShape(50),
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Text(text = "Adopt", modifier = Modifier.padding(8.dp))
        }
    },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        bottomBar = {
            BottomAppBar(cutoutShape = CutCornerShape(50), content = {

            })
        })

}

@ExperimentalFoundationApi
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
//        MyApp()
    }
}

@ExperimentalFoundationApi
@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
//        MyApp()
    }
}
