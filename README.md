banner-starter
---------------

This is a Multi Module Spring Boot autoconfig + starter demonstration project.

The `InitializingBean` in `StarterAutoConfiguration` is not automatically scanned into the application,
but loaded by `@EnableAutoConfiguration` through `spring.factories`.