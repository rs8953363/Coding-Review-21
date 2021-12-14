package course2_day1;

public class APIReview {
    /*- assertion using Hamcrest Matchers
    .and().assertThat()
          .contentType("application/json")

- assertion using path()
    String name = response.body().path("name[0]");

- assertion using JsonPath
    JsonPath jsonData = response.jsonPath();
        jsonData.getInt("id");

- assertion using De-serialization with Collections (Gson --> Json parser, object mapper)
    Map <String, Object> spartanMap = response.body().as(Map.class);

- assertion using De-serialization with (POJO)
    Spartan spartan1 = response.body().as(Spartan.class);
            Assert.assertEquals(spartan1.getName(),"Meta");
            Assert.assertEquals(spartan1.getPhone(), "1234285464");

- assertion using serialization
      //Serialization Java object -> Json body
    Spartan spartan = new Spartan(101, "Mike", "Male", 2315462);

      //converting custom class to Json(serialization)
    String jsonBody = gson.toJson(spartan);
     */

    /*<dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.7.2</version>
        </dependency>
groupId – a unique base name of the company or group that created the project
artifactId – a unique name of the project
Enum — Today at 11:02 AM
groupId uniquely identifies your project across all projects. A group ID should follow Java's package name rules.
artifactId is the name of the jar without version.

     */
    /*json vs gson
API :: 6
➔ JSON is a format which has key and values.
➔ Gson is a Java library that can be used to convert Java Objects into their JSON
representation. It can also be used to convert a JSON string to an equivalent Java object.
➔ GSON is a process of converting:
◆ from java to json(serialization)
◆ from json to java(deserialization
Types of assertions:
- assertion using Hamcrest Matchers
    .and().assertThat()
          .contentType("application/json")

- assertion using path()
    String name = response.body().path("name[0]");

- assertion using JsonPath
    JsonPath jsonData = response.jsonPath();
        jsonData.getInt("id");

- assertion using De-serialization with Collections (Gson --> Json parser, object mapper)
    Map <String, Object> spartanMap = response.body().as(Map.class);

- assertion using De-serialization with (POJO)
    Spartan spartan1 = response.body().as(Spartan.class);
            Assert.assertEquals(spartan1.getName(),"Meta");
            Assert.assertEquals(spartan1.getPhone(), "1234285464");

- assertion using serialization
      //Serialization Java object -> Json body
    Spartan spartan = new Spartan(101, "Mike", "Male", 2315462);

      //converting custom class to Json(serialization)
    String jsonBody = gson.toJson(spartan);
Enum — Today at 10:39 AM
Hamcrest matchers Assertion:
given().accept(ContentType.JSON)
                .and().pathParam("id", 10)
                .when().get("/api/spartans/{id}")
                .then().statusCode(200)
                .and().assertThat().contentType("application/json")
                .and().assertThat().body("id", equalTo("10")
                                 ,"name",equalTo("lorenza")
                                      ,"gender",equalTo("Female")
                                      ,"phone",equalTo("3312820993"));

     */
}
