## Spring Cloud property propagation example

### How to

1. Start config-server
2. Start application with one of profiles `cloud-first`, `cloud-last`, or `system-first`
(optionally add system property e.q. `-Dserver.port=8081`)