# Yiris #

[![Build Status](https://travis-ci.org/kasonchan/yiris.svg?branch=master)](https://travis-ci.org/kasonchan/yiris)
[![codecov.io](https://codecov.io/github/kasonchan/yiris/coverage.svg?branch=master)](https://codecov.io/github/kasonchan/yiris?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/grade/943b99ac897a41428961090116755437)](https://www.codacy.com/app/kasonchan/yiris)

Yiris is a backend library of wastewater treatment simulation. 
Its mission is to provide the developers simple and robust API primitives to build
their own wastewater treatment simulation application.

## Modules ##

Yiris uses multi-project structure and contains of the following _modules_:

* [`yiris-core`](core) - the core classes/functions.
* [`yiris-objects`](objects) - the objects class/functions.

## Installation ##

Every Equations module is published at Maven Central. Use the following _sbt_ snippet ...

* for the _stable_ release:

```scala
libraryDependencies ++= Seq(
  "com.kasonchan" %% "[yiris-module]" % "0.1.0"
)
```

* for the `SNAPSHOT` version:

```scala
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.kasonchan" %% "[yiris-module]" % "0.1.0-SNAPSHOT" changing()
)
```

### Documentation ###

- A comprehensive documentation may be found in the `docs/` folder.
- The latest Scaladoc is available at http://kasonchan.github.io/yiris/docs/.
