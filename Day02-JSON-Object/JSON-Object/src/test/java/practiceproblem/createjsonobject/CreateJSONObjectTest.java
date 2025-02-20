package practiceproblem.createjsonobject;


import com.practiceproblem.createjsonobject.CreateJsonObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreateJSONObjectTest {

    @Test
    void testJsonObjectCreation(){
        String ans="{\"subject\":[\"Java\",\"Hindi\",\"Science\"],\"name\":\"Raksha\",\"age\":21}";
        assertEquals(CreateJsonObject.createJsonObject(),ans);
    }
}