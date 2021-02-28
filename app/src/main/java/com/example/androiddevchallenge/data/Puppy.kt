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
package com.example.androiddevchallenge.data

/**
 *
 */
data class Puppy(
    val name: String,
    val sex: Sex,
    val birthdate: String,
    val age: String,
    val profilePic: String,
    val weight: String,
    val breed: String,
    val bio: String
)

enum class Sex { Male, Female }

val listOfPuppies = listOf(
    Puppy(
        name = "Rufus",
        sex = Sex.Male,
        birthdate = "01/18/1989",
        age = "6 mo",
        profilePic = "https://cdn.pixabay.com/photo/2016/05/09/10/42/weimaraner-1381186__340.jpg",
        weight = "8 lbs",
        breed = "Weimaraner",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Poppy",
        sex = Sex.Female,
        birthdate = "01/18/1989",
        age = "9 mo",
        profilePic = "https://cdn.pixabay.com/photo/2015/12/08/00/52/puppy-1082141_960_720.jpg",
        weight = "10 lbs",
        breed = "Labrador",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Doggo",
        sex = Sex.Female,
        birthdate = "01/18/1989",
        age = "1 yr 9 mo",
        profilePic = "https://cdn.pixabay.com/photo/2016/01/05/17/51/maltese-1123016_960_720.jpg",
        weight = "12 lbs",
        breed = "Maltese",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Tigger",
        sex = Sex.Male,
        birthdate = "11/18/2020",
        age = "4 mo",
        profilePic = "https://cdn.pixabay.com/photo/2016/07/15/15/55/dachshund-1519374_960_720.jpg",
        weight = "16 lbs",
        breed = "Dachshund",
        bio = "Tigger is a standard middle of the road best of all worlds pup. He likes to play and can dish it out rough or be sweet. He is very interested in other dogs and will be vocal when her foster siblings walk past and ignore her but isn't too loud or excessive in using her voice. He likes to give some sweet kisses but isn't overly affectionate. Basically he is a regular pup with a lot to learn and is ready for a family to teach him the ways."
    ),
    Puppy(
        name = "Alfred",
        sex = Sex.Male,
        birthdate = "01/18/1989",
        age = "6 mo",
        profilePic = "https://cdn.pixabay.com/photo/2016/01/02/18/39/puppy-1118584__340.jpg",
        weight = "25 lbs",
        breed = "Bulldog",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Scout",
        sex = Sex.Male,
        birthdate = "01/18/1989",
        profilePic = "https://cdn.pixabay.com/photo/2019/05/27/19/08/puppy-4233378_960_720.jpg",
        weight = "19 lbs",
        age = "11 mo",
        breed = "Bulldog",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Pixie",
        sex = Sex.Female,
        birthdate = "01/18/1989",
        profilePic = "https://cdn.pixabay.com/photo/2016/02/18/18/37/puppy-1207816__340.jpg",
        weight = "16 lbs",
        age = "2 yrs",
        breed = "Golden Retriever",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Axel",
        sex = Sex.Male,
        birthdate = "01/18/1989",
        profilePic = "https://cdn.pixabay.com/photo/2017/09/25/13/12/dog-2785074_960_720.jpg",
        weight = "16 lbs",
        age = "2 yrs",
        breed = "Cocker Spaniel",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Diane",
        sex = Sex.Female,
        birthdate = "01/18/1989",
        profilePic = "https://cdn.pixabay.com/photo/2015/11/17/13/13/dogue-de-bordeaux-1047521__340.jpg",
        weight = "16 lbs",
        age = "9 mo",
        breed = "De Bordeax",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    ),
    Puppy(
        name = "Bert",
        sex = Sex.Male,
        birthdate = "01/18/1989",
        profilePic = "https://cdn.pixabay.com/photo/2014/05/03/01/04/puppy-336707_960_720.jpg",
        weight = "16 lbs",
        age = "1 yr 6 mo",
        breed = "Black Labrador",
        bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer tristique fermentum dignissim. Suspendisse ut risus tristique, accumsan est eu, sagittis ipsum. Integer et nunc sit amet leo maximus vestibulum. Etiam ut neque eget felis molestie auctor. Nam non libero purus. Aenean eu nibh efficitur, sollicitudin ipsum id, volutpat nisl. Maecenas nisi dui, semper ac scelerisque sit amet, luctus sit amet mi. Quisque tellus arcu, accumsan et fringilla quis, pellentesque nec tortor. Curabitur eu ante nunc. Morbi et ligula dui. Pellentesque velit nibh, tempus at vehicula nec, gravida vitae ipsum. Proin justo nunc, interdum in diam vitae, feugiat tempus purus. Suspendisse potenti. Nunc urna metus, varius imperdiet lacus quis, pretium placerat nulla. Duis vel aliquet ante. Praesent nec arcu vitae odio dapibus molestie eget ut felis."
    )
)
