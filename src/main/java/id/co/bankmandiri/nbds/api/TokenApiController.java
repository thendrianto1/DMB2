package id.co.bankmandiri.nbds.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import id.co.bankmandiri.nbds.services.GetKeyUsingGETI;
import id.co.bankmandiri.nbds.model.GetKeyUsingGETP;
import id.co.bankmandiri.nbds.model.GetKeyUsingGETResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TokenApiController implements TokenApi {

	@Autowired
	GetKeyUsingGETI getKeyUsingGETI;


    public ResponseEntity<Object> getKeyUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name){
        
        GetKeyUsingGETResponseWrapper res  = getKeyUsingGETI.execute(new GetKeyUsingGETP(name));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
