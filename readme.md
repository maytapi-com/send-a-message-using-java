# Send a Message Using Java with Maytapi WhatsApp API

This repository demonstrates how to send a WhatsApp message using Java and the Maytapi WhatsApp API. Maytapi provides a powerful and easy-to-use API for integrating WhatsApp messaging into your applications.

## Features

- Send text messages to WhatsApp numbers
- Easy integration with Maytapi WhatsApp API
- Configurable settings for API credentials

## Requirements

- Java 8 or higher
- Maven for dependency management
- Unirest-java library
- Maytapi account and API credentials

## Installation
1. Clone this repository:<br/>
```
https://github.com/maytapi-com/send-a-message-with-java-using-whatsapp-api.git
cd project-folder
```
2. Configure your Maytapi credentials:<br/>
```
product.id=your_product_id
phone.id=your_phone_id
api.key=your_api_key
```
3. Build the project:
```bash
mvn clean install
```

## Usage 
To send a test message, run the SendMessage class:
```bash
mvn exec:java -Dexec.mainClass="com.example.SendMessage"
```
To use in your own project:
1. Add the necessary dependencies to your pom.xml:
```
<dependencies>
<dependency>
<groupId>com.konghq</groupId>
<artifactId>unirest-java</artifactId>
<version>3.13.6</version>
</dependency>
<dependency>
<groupId>org.json</groupId>
<artifactId>json</artifactId>
<version>20210307</version>
</dependency>
</dependencies>
```

2. Use the SendMessage class as a reference to implement the API call in your code.

## Quick Start

1. Clone this repository
2. Configure your Maytapi credentials in src/main/resources/config.properties
3. Run mvn clean install to build the project
4. Execute the SendMessage class to send a test message

> [!NOTE]
> **To perform all these operations correctly, you need to register with maytapi.com, get the credentials, and place them in the config file.**


## Why Maytapi?

[Maytapi](https://maytapi.com) offers a robust WhatsApp API solution with features like:

- Multi-device support
- Affordable pricing
- Easy integration
- Comprehensive documentation

Learn more about Maytapi's [WhatsApp API](https://maytapi.com) and how it can benefit your projects.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Support

For questions about Maytapi's WhatsApp API, visit [official documentation](https://maytapi.com/whatsapp-api-documentation) or contact  support team.
