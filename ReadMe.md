# TinNews

<p align="center">
<img src="https://img.shields.io/badge/Backend-%20Java%20-F6922B.svg">
<img src="https://img.shields.io/badge/Frontend-%20Java%20-43dcf2.svg">
<img src="https://img.shields.io/badge/Framework- MVVM %20-ec63a8.svg">
<img src="https://img.shields.io/badge/Database-%20 RoomDB %20-3de540.svg">
<img src="https://img.shields.io/badge/Platform-%20Android App%20-F6F063.svg">
</p>

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## 🎬 About the project

  According to a recent research conducted by [*the Atlantic*](https://www.theatlantic.com/technology/archive/2016/05/how-many-stories-do-newspapers-publish-per-day/483845/), the *Times* publishes about 230 pieces of content—stories, graphics, interactives, and blog posts—**daily**. As a reader, I often feel overwhelmed by the amount of notications sent by the news app per day, and easily get interrupted or distracted by the pop-out ads when I try to read the articles. How can we take more control over what we want to read? How can we make news reading experience more curated and personal? 
  
Inspired by Tinder, this android APP provides a clean and interactive UI that with each launch, it will retrieve 20 latest global news using News API, displayed as cardStackView with headline and image, to allow users to swipe left and right to discard or save news for later read. The app also supports users to search news by keyword and create their favorite news lists for future review. 

![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## :film_strip: Project Demo
<p align="center">
<img src="https://user-images.githubusercontent.com/78308927/134451070-bb7b60f2-76b5-4b5e-a269-b154f9cefa72.gif" height="600"/>
</p>

## 🤖 Tech Stack

* Java
* Android JetPack 
* RoomDB
* Retrofit
* Android Studio
* Google Component Architectural MVVM Pattern

## 📐 Design Doc

<p align="center">
<img src="https://user-images.githubusercontent.com/78308927/136308686-f0d075e4-dde6-4781-8dc9-0f7eeef33315.jpg" height="700">
</p>

## :fire: Key Features

<p align="justify"> 
  For those of you not familiar with Pacman, it's a game where Pacman (the yellow circle with a mouth in the above figure) moves around in a maze and tries to eat as many food pellets (the small white dots) as possible, while avoiding the ghosts (the other two agents with eyes in the above figure). If Pacman eats all the food in a maze, it wins.
</p>


- **Achieved Google Component Architectural MVVM Pattern using one single activity with multiple fragments**.
- **Implemented the bottom view & page navigation using JetPack navigation component** 
- **Utilized 3rd party CardStackView(RecyclerView) to support Tinder-like swipe gestures for likes/dislikes**.
- **Built the Room Database with LiveData & ViewModel to support local cache and offline model**.
- **Integrated Retrofit and LiveData to pull the latest news data from a RESTFUL endpoint (newsapi.org)**.


