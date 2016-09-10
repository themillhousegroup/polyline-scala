# Polyline-Scala
A Scala Polyline Encoder and Decoder

Google Documentation on polyline encoding can be found here: https://developers.google.com/maps/documentation/utilities/polylinealgorithm

### IMPORTANT

This is a **fork** of [trifectalabs/polyline-scala](https://github.com/trifectalabs/polyline-scala) that exists only to allow an artifact to be published to Bintray, meaning the `polyline-scala` library can be used as a regular SBT dependency as follows:

Add the following to your project's `build.sbt`:

- The Bintray repo:
- 
```
   resolvers ++= Seq(
     "Millhouse Bintray"  at "http://dl.bintray.com/themillhousegroup/maven"   )
```

- The dependency itself:
- 
```
   libraryDependencies ++= Seq(
     "trifectalabs" %% "polyline-scala" % "1.0.3"
   )
   ```
