# Repository Profile

## Baseline

- Java 21
- Spring Boot 3.5.9
- Gradle 8.14.3
- springdoc 2.2.0
- five passing tests across service, HTTP, and application context
- CI and a basic Java 21 container already present

The baseline is healthy and already uses records, constructor injection, and a
central error handler. Modernization is therefore limited to supported platform
versions, current CI runtimes, reproducibility, container hardening, and clearer
documentation. The Berlin Clock API contract is the compatibility boundary.
