# Java Domainrobot Sdk

A java package for easy integration of the **Domainrobot API** powered by [InterNetX GmbH](https://internetx.com).

## Table of Contents

1. [Preamble](#preamble)
2. [Install And Import](#install-and-import)
   * [Download repository](#download-repository)
   * [Install to local repository](#install-to-local-repository)
   * [Pom](#pom)
3. [Usage](#usage)
   * [Provider](#provider)
   * [Supported API calls](#supported-api-calls)
   * [Models](#models)
   * [Exception handling](#exception-handling)
4. [Changelog](#changelog)
5. [Copyright and license](#copyright-and-license)

## Preamble

This Maven package is not available via known repositories. It must be manually installed into a local Maven repository.

## Install And Import

### Download repository

Download the code from the current release on the [release page](https://github.com/InterNetX/java-domainrobot-sdk/releases).

### Install to local repository

```bash
cd /path/to/package
mvn install
```

### Pom

Update pom.xml and add the following line to your dependencies.

```xml
<dependency>
    <groupId>org.domainrobot</groupId>
    <artifactId>sdk-client</artifactId>
    <version>0.1.0</version>
</dependency>
```

## Usage

### Provider

The package contains a [Domainrobot](/src/main/java/org/domainrobot/java_domainrobot_sdk/Domainrobot.java) class that is the main access to the api. Instantiate the class with your api credentials and the matching baseUrl of the api.

* Productive System: <https://api.autodns.com/v1>
* Demo System: <https://api.demo.autodns.com/v1>

```java
String userName = "USER";
String password = "PASSWORD";
String context = "CONTEXT";
String baseUrl = "URL";
Domainrobot sdk = Domainrobot(userName,password,context,baseUrl);
```

### Supported API calls

#### Domainstudio tasks

```java
List<DomainEnvelope> search(DomainEnvelopeSearchRequest body, MultiValueMap<String, String> customHeaders);
```

#### Certificate tasks

```java
Certificate realtime(Certificate body, Map<String, String> customHeaders);
CertificateData prepareOrder(CertificateData body, Map<String, String> customHeaders);
```

### Models

The package contains many classes that represent entities from the Domainrobot API. All Models can be used inside of your own project.

### Exception handling

If there is any error response from the API. The DomainRobotprovider will throw a [DomainRobotApiException](/lib/src/model/exception/DomainRobotApiException.dart), which contains information about the error.

```java
String userName = "USER";
String password = "PASSWORD";
String context = "4";
String baseUrl = "https://api.autodns.com/v1";
Domainrobot sdk = new Domainrobot(userName, context, password, baseUrl);
DomainEnvelopeSearchRequest body = new DomainEnvelopeSearchRequest();
DomainStudioSources sources = new DomainStudioSources();
sources.suggestion(new DomainStudioSourceSuggestion().max(5));
body.searchToken("java").sources(sources);
try {
    List<DomainEnvelope> data = sdk.domainStudio.search(body, null);
    for (DomainEnvelope d : data) {
        System.out.println(d.getDomain());
    }
} catch(DomainrobotApiException e) {
    // Handle exception from the API
    System.out.println(e.getMessage());
    System.out.println(e.getErrorCode());
    System.out.println(e.getBody());
} catch(Exception e) {
    // Handle unexpected exception
    System.out.println("Unknown error " + e);
}
```

## Changelog

For a detailed changelog, see the [CHANGELOG.md](CHANGELOG.md) file

## Copyright and license

MIT License

Copyright (c) 2020 InterNetX GmbH

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
