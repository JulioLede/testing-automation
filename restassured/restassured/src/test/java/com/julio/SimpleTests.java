package com.julio;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured; 
import org.junit.jupiter.api.Test; 
import static io.restassured.RestAssured.given; 
import static org.hamcrest.Matchers.*; 

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apiguardian.api.API;

public class SimpleTests {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    //Ejercicio 1: Verificación de estado HTTP

    //Objetivo: Realizar una solicitud GET a la API pública de JSONPlaceholder y 
    //verificar que el estado HTTP es 200.
    @Test
    void verifyStatusCode() {
        given()
        .when()
        .get("https://jsonplaceholder.typicode.com/posts/1")
        .then().statusCode(200);
    }

    //Ejercicio 2: Validación de contenido de respuesta
    //Objetivo: Realizar una solicitud GET al mismo endpoint y verificar que el userId es igual a 1.

    @Test
    public void verifyUserId() {
        given()
        .when().get("https://jsonplaceholder.typicode.com/posts/1")
        .then().body("userId", equalTo(1));    
    }

    //Ejercicio 3: Verificación de cabecera de respuesta
   //Objetivo: Realizar una solicitud GET al endpoint proporcionado y 
   //verificar que el contenido de la cabecera Content-Type es application/json; charset=utf-8.
   @Test
   public void verifyContentTypeHeader() {
     given()
     .when()
     .get("https://jsonplaceholder.typicode.com/posts/1")
     .then()
     .header("Content-Type", "application/json; charset=utf-8");
    }

    /*Ejercicio 4: Realizar una solicitud POST
    Objetivo: Realizar una solicitud POST al endpoint proporcionado con un cuerpo de solicitud 
    y verificar que la respuesta contenga el mismo cuerpo. */

    @Test public void postRequest() { 
        String requestBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}"; 
        given() .contentType("application/json") .body(requestBody) 
        .when() .post("https://jsonplaceholder.typicode.com/posts") 
        .then() .statusCode(201) .body("title", equalTo("foo")) .body("body", equalTo("bar")) .body("userId", equalTo(1)); 
    }

    /*Ejercicio 5: Verificación de estado HTTP de otro recurso
    Objetivo: Realizar una solicitud GET a la API pública de JSONPlaceholder para obtener un comentario 
    y verificar que el estado HTTP es 200.
    Endpoint: https://jsonplaceholder.typicode.com/comments/5 */

    @Test public void verifyHTTPStatus(){
        given()
        .when()
        .get("https://jsonplaceholder.typicode.com/comments/5")
        .then().statusCode(200);
    }

    /* Ejercicio 6: Validación de contenido de respuesta en una lista
    Objetivo: Realizar una solicitud GET al endpoint de 'todos' y verificar que 
    el primer 'todo' tiene el userId igual a 1.
    Endpoint: https://jsonplaceholder.typicode.com/todos */

    @Test public void validateContentResponse() {
        given()
        .when().get("https://jsonplaceholder.typicode.com/todos/1")
        .then().body("userId", equalTo(1));  
    }

    /* Ejercicio 7: Verificación de contenido en una respuesta con múltiples resultados
    Objetivo: Realizar una solicitud GET a la API pública de JSONPlaceholder para obtener 
    todos los posts de un userId específico y verificar que se reciben más de 5 posts.
    Endpoint: https://jsonplaceholder.typicode.com/posts?userId=1 */

    @Test
    public void verifyContentMultipleResults() {
        given()
        .when().
        get("https://jsonplaceholder.typicode.com/posts?userId=1")
        .then()
        .body("size()", greaterThan(5));   
    }



   
   



}

