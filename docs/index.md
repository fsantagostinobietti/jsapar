---
layout: page
title: JSaPar Contents
---
**JSaPar** stands for  **J**ava **S**chem**a** based **Par**ser

JSaPar is a Java library providing a schema based parser and composer of almost all sorts of delimited and fixed 
width files.

It is an open source java library created with the purpose of
making it easy to process delimited and fixed width data sources.
By separating the description of the data format into a schema that can be loaded from XML it makes the code
easier to maintain and increases flexibility.

* TOC
{:toc}

## Mission
The goal of this project is a java library that removes the burden of parsing and composing flat files and csv files from the developer.

The library should
* Be easy to use for both simple and complex situations.
* Be possible to extend.
* Have a low memory impact and good performance.
* Be flexible to use in different situations.
* Be independent of other (third party) libraries.
* Use schemas in order to distinctly separate the description of the format of the data source from the code.
* Unburden the tremendous tasks for a developer dealing with fixed width and delimited data sources.

## Features
* Support for type conversion while parsing and composing.
* Uses a schema to express the source or target format.
* Support for different type of lines where line type is determined by the value of defined "condition cells". 
* The schema can be expressed with xml notation or created directly within the java code.
* Can handle internationalization of numbers and dates both while parsing and composing.
* The parser can either produce a Document class, representing the content of the file, or you can choose to provide 
a consumer for each line that is successfully parsed.
* Can handle huge files without loading everything into memory.
* The output Document class contains a list of lines which contains a list of cells.
* The input and outputs are given by java.io.Reader and java.io.Writer which means that it is not necessarily files
that are parsed or generated.
* The schema contains information about the format of each cell regarding data type and syntax.
* Errors can either be handled by exceptions thrown at first error or the errors can be collected during
parsing to be able to deal with them later.
* Can consume or produce an internal xml format which can be used to transform any of the supported formats 
into any markup language by the use of xslt.
### Bean mapping features
* Support converting Java objects to or from any of the other supported input or output formats.
* Supports natively all primitive types, `Number`, `String`, `BigDecimal`, `BigInteger`, `Enum`, `java.util.Date` and the `java.time` types.
* It is possible to programmatically make manipulations and transformations between parsing and the bean is created which makes it possible to 
join and split cells that do not fit a bean property one-to-one.
### CSV features
* Support for CSV and all other kinds delimited files such as TAB-separated or multi character separated.
* Configurable line separator character sequence.
* Handles quoted cells with configurable quote character.
* Can handle quotes both according to [RFC4180](https://tools.ietf.org/html/rfc4180) and naive quoting first and last.
* Handles multi line quoted CSV cells. Line breaks are allowed within quoted cells.
* Cell separator can be configured as one or multiple characters.
### Fixed width features
* Can both parse and compose flat files with fixed positions with or without line separator characters.
* Custom fill character
* Custom cell alignment
* [Implied decimal](http://www.3480-3590-data-conversion.com/article-implied-decimal.html)

## Documentation
* [Release notes](release_notes)
* [Introduction](introduction)
* [Basics](basics)
* [Basics of Schema](basics_schema)
* [Javadocs API documentation](https://javadoc.io/doc/org.tigris.jsapar/jsapar)
* [Upgrading from JSaPar 1.x versions](upgradingfrom)

## Resources
* [Source code and issues](https://github.com/org-tigris-jsapar/jsapar)
* [Examples](https://github.com/org-tigris-jsapar/jsapar-examples)
* <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.tigris.jsapar%22%20AND%20a%3A%22jsapar%22">Maven coordinates and binaries download</a><br/>
* <a href="http://jsapar.tigris.org/servlets/ProjectDocumentList">Download historical binaries</a><br/>
* <a href="http://jsapar.tigris.org">The original project web page with historical archive.</a><br/>
* For questions about usage, use [Stack overflow with the jsapar tag](https://stackoverflow.com/questions/tagged/jsapar)

## Dependencies
This project has no dependencies to other external libraries in runtime.

However, if you plan to build and test the source consider the following:

* To build the source it is recommended to use <a href="https://maven.apache.org/">Maven</a>. A Maven pom.xml is provided. As of version 1.6, the library is published in the public <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.tigris.jsapar%22%20AND%20a%3A%22jsapar%22">Maven repository</a>.
* The provided test classes require JUnit4 in order to run.
* JSaPar version 2.1 requires Java JDK 11 or later to build but the official binaries are built for release 8, so they will work for Java 8 or later.
* JSaPar version 2.0 requires Java 8 or later.
* JSaPar version 1.5-1.8 are built with Java 7. 
* Earlier versions of the library in the download packages are built with Java 6 but with target compatibility level 1.5. It is no guarantee that the library will work for earlier version of Java.

## Other sources of information
* [Links to other related projects](links)


