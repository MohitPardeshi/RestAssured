public class Payload {

    public static String addPlacePayload(){
        return "{\n" +
                "    \"location\":{\n" +
                "        \"lat\":-38.383494,\n" +
                "        \"lng\":33.427362\n" +
                "    },\n" +
                "    \"accuracy\":50,\n" +
                "    \"name\":\"Test\",\n" +
                "    \"phone_number\":\"(+91) 912 345 6789\",\n" +
                "    \"address\":\" Temp\",\n" +
                "    \"types\":[\n" +
                "        \"shoe park\",\n" +
                "        \"shop\"\n" +
                "    ],\n" +
                "    \"website\":\"https://temp.com\",\n" +
                "    \"language\":\"English\"\n" +
                "}";
    }
}
