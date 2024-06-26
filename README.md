# scalatestplus-testng-configuration-mwe

This repository demonstrates a bug or strange behavior of SBT when running TestNG tests via the ScalatestPlus integration.

## Behavior

There are tests in two SBT configurations: the built-in `Test` configuration, and a custom `E2E` configuration.
In each configuration, there are test classes extending `org.scalatest.Suite`:
* In `src/test/scala` and `src/e2e/scala`, we extend `org.scalatest.flatspec.AnyFlatSpecLike`;
* In `src/test/java` and `src/e2e/java`, we extend `org.scalatestplus.testng.TestNGSuite`.

### Behavior in `Test` is expected

```shell
sbt test
[snip]
[error] Failed tests:
[error]         smedbergm.mwe.StubTest
[error]         smedbergm.mwe.StubSpec
```

That is, both the Scala and Java tests are executed.

### Behavior in `E2E` is unexpected

```shell
[snip]
[error] Failed tests:
[error]         StubE2ESpec
```

That is, only the Scala tests are discovered and executed.