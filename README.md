Sponge/Spigot Essentials
========================

[![Join the chat at https://gitter.im/kinggoesgaming/S-S-Essentials](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/kinggoesgaming/S-S-Essentials?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## Status

Master: [![Master Status]](https://travis-ci.org/kinggoesgaming/S-S-Essentials)

SpongeAPI: [![SpongeAPI Status]](https://travis-ci.org/kinggoesgaming/S-S-Essentials)

Sponge: [![Sponge Status]](https://travis-ci.org/kinggoesgaming/S-S-Essentials)

**Currently not stable and under heavy development**

A minecraft plugin for Sponge platforms.
Contains many essential commands, features and a lot useful APIs.

## Links ##
* [Source]
* [Wiki]
* [Issues]

## License ##
This plugin is licensed under [MIT License].
This means that you are allowed to code in any way you would like.
However this does not mean that you can publish the plugin, modified or not, on any resource sharing websites.
For more information, see [publishing guidelines].

## Prerequisites ##
* [Java] 8

## Contributing ##
I really appreciate if people contribute to the project.
I have a general set of [rules] I follow for my projects.
Do read through it if you do plan on contributing.

## Clone ##
The following steps will ensure your project is cloned properly

1. `git clone git@github.com:kinggoesgaming/S-S-Essentials.git`
2. `cd S-S-Essentials`

## Development Environment ##
__Note:__ If you do not have [Gradle] installed then use ./gradlew for Unix systems or Git Bash and gradlew.bat for
Windows systems in place of any 'gradle' command.

If you are a contributor, it is important that your development environment is setup properly. After cloning, as shown 
above, follow the given steps for your ide:

#### [IntelliJ]

1. `gradle idea --refresh-dependencies`

#### [Eclipse]

1. `gradle eclipse --refresh-dependencies`

## Updating your Clone ##
__Note:__ If you do not have [Gradle] installed then use ./gradlew for Unix systems or Git Bash and gradlew.bat for
Windows systems in place of any 'gradle' command.

The following steps will update your clone with the official repo.

* `git pull`
* `gradle --refresh-dependencies`

## Building
__Note:__ If you do not have [Gradle] installed then use ./gradlew for Unix systems or Git Bash and gradlew.bat for
Windows systems in place of any 'gradle' command.

We use [Gradle] for Essence Sponge.

In order to build Essence Sponge you simply need to run the `gradle` command.
You can find the compiled JAR file in `./build/libs` labeled similarly to 'SS-Essentials-x.x-SNAPSHOT.jar'.

[Master Status]: https://travis-ci.org/kinggoesgaming/S-S-Essentials.svg?branch=master
[SpongeAPI Status]: https://travis-ci.org/kinggoesgaming/S-S-Essentials.svg?branch=spongeapi
[Sponge Status]: https://travis-ci.org/kinggoesgaming/S-S-Essentials.svg?branch=sponge
[Source]: https://github.com/kinggoesgaming/S-S-Essentials
[Wiki]: https://github.com/kinggoesgaming/S-S-Essentials/wiki
[Issues]: https://github.com/kinggoesgaming/S-S-Essentials/issues
[MIT License]: https://tldrlegal.com/license/mit-license
[publishing guidelines]: Publishing.md
[Java]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[rules]: Contributors.md
[IntelliJ]: https://www.jetbrains.com/idea/
[Eclipse]: https://www.eclipse.org/
[Gradle]: https://www.gradle.org/