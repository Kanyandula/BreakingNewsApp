# BreakingNewsApp


<p align="center">
This is a News application that fetches data from the network and display it to the user. It has got functionalities that let the user  search, save , share and delete favourite news article by swiping left  or right. The app launches with an animated splash screen, has got a few nice animated features during navigation  and has a very nice Icon.
  </p>


## Tech Stack
![Animated GIF-downsized_large](https://user-images.githubusercontent.com/37294453/110720400-64f31900-8206-11eb-990e-6cf8b62f71ee.gif)

- [Kotlin](https://kotlinlang.org/)  
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)  
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) for asynchronous.
- Dagger-Hilt (alpha) for dependency injection.
- JetPack Components
- Material Design Components
- Navigation UI
- Architecture
  - MVVM Architecture 
  - Repository pattern
  - Database Cache as Single Source of Truth
  - Single activity Pattern

  

### News Api
[News Api](https://newsapi.org/) provides live top and breaking headlines for a country, specific category in a country, single source, or multiple sources. You can also search with keywords. Articles are sorted by the earliest date published first.
  
### Libraries
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - construct the REST APIs and paging network data.

- [Lottie](https://github.com/airbnb/lottie-android) - Lottie is a mobile library for Android and iOS that parses Adobe After Effects animations exported as json with Bodymovin and renders them natively on mobile!
- [Gson](https://github.com/google/gson) - Gson is a Java library that can be used to convert Java Objects into their JSON representation.
- [Room](https://developer.android.com/topic/libraries/architecture/room) - For storing Database.
- [Glide](https://github.com/bumptech/glide) - Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs.


