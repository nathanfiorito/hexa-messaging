package br.com.nathanfiorito.hexa.messaging.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "br.com.nathanfiorito.hexa.messaging")
public class ClassSufixTest {
    @ArchTest
    public static final ArchRule ShouldBeSuffixedConsumer = classes()
            .that()
            .resideInAPackage("..consumer")
            .should()
            .haveSimpleNameEndingWith("Consumer")
            .as("As classes do package consumer devem ter o sufixo Consumer");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedMapper = classes()
            .that()
            .resideInAPackage("..mapper")
            .should()
            .haveSimpleNameEndingWith("Mapper")
            .orShould()
            .haveSimpleNameEndingWith("MapperImpl")
            .as("As classes do package mapper devem ter o sufixo Mapper ou MapperImpl");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedController = classes()
            .that()
            .resideInAPackage("..controller")
            .should()
            .haveSimpleNameEndingWith("Controller")
            .as("As classes do package controller devem ter o sufixo Controller");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedRequest = classes()
            .that()
            .resideInAPackage("..request")
            .should()
            .haveSimpleNameEndingWith("Request")
            .as("As classes do package request devem ter o sufixo Request");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedResponse = classes()
            .that()
            .resideInAPackage("..response")
            .should()
            .haveSimpleNameEndingWith("Response")
            .as("As classes do package response devem ter o sufixo Response");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedClient = classes()
            .that()
            .resideInAPackage("..client")
            .should()
            .haveSimpleNameEndingWith("Client")
            .as("As classes do package client devem ter o sufixo Client");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedRepository = classes()
            .that()
            .resideInAPackage("..repository")
            .should()
            .haveSimpleNameEndingWith("Repository")
            .as("As classes do package repository devem ter o sufixo Repository");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedEntity = classes()
            .that()
            .resideInAPackage("..entity")
            .should()
            .haveSimpleNameEndingWith("Entity")
            .as("As classes do package entity devem ter o sufixo Entity");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedAdapter = classes()
            .that()
            .resideInAPackage("..adapters.out")
            .should()
            .haveSimpleNameEndingWith("Adapter")
            .as("As classes do package adapters.out devem ter o sufixo Adapter");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedUseCase = classes()
            .that()
            .resideInAPackage("..application.core.usecase")
            .should()
            .haveSimpleNameEndingWith("UseCase")
            .as("As classes do package application.core.usecase devem ter o sufixo UseCase");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedOutputPort = classes()
            .that()
            .resideInAPackage("..application.ports.out")
            .should()
            .haveSimpleNameEndingWith("OutputPort")
            .as("As classes do package application.ports.out devem ter o sufixo OutputPort");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedInputPort = classes()
            .that()
            .resideInAPackage("..application.ports.in")
            .should()
            .haveSimpleNameEndingWith("InputPort")
            .as("As classes do package application.ports.in devem ter o sufixo InputPort");

    @ArchTest
    public static final ArchRule ShouldBeSuffixedInputConfig = classes()
            .that()
            .resideInAPackage("..config")
            .should()
            .haveSimpleNameEndingWith("Config")
            .as("As classes do package config devem ter o sufixo Config");
}
