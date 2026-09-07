# Repository Working Agreement

- Do not commit modernization work directly to `main`.
- Merge focused branches into `modernization/spring-boot-4-1`.
- Leave the final pull request to `main` for owner review and merge.
- Preserve `GET /api/berlin-clock?time=HH:mm:ss` and its response fields.
- Verify on Java 21 with `./gradlew --no-daemon clean test`.
