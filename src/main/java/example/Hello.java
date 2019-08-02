package example;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class Hello implements RequestHandler<CustomRequest, CustomResponse> {
    public CustomResponse handleRequest(CustomRequest request, Context context) {
      return new CustomResponse("returning name ["+request.getInputName()+"]","returning email ["+request.getEmail()+"]",request.getPhone());
    }
}
