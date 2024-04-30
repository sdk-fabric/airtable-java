
# Airtable SDK

This SDK is managed by the [SDK Fabric](https://sdk-fabric.org/) project.
Our goal is to build a global infrastructure to automatically generate
an SDK for every API, please take a look at our website for more information.

## Contribution

Please do not create a pull requests at this repository since the code is
automatically generated. If an operation or type is missing at the client SDK
please register at the [TypeHub](https://typehub.cloud/) platform and create
a pull request at the [Airtable](https://app.typehub.cloud/d/sdkfabric/airtable)
specification. The system will then automatically create a GIT commit and update
the code.

## Usage

The following example shows how you can use the client:

```java
CredentialsInterface credentials = new HttpBearer('[access_token]');
Client client = Client::build(credentials);

// @TODO use the client
```
