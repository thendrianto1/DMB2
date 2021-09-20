package id.co.bankmandiri.nbds.api;

import id.co.bankmandiri.nbds.model.BranchTellerCounterResponse;
import id.co.bankmandiri.nbds.model.FingerprintRequest;
import id.co.bankmandiri.nbds.model.FingerprintResponse;
import id.co.bankmandiri.nbds.model.GetTellerUserResponse;
import id.co.bankmandiri.nbds.model.LoginInitializationResponse;
import id.co.bankmandiri.nbds.model.LoginRequest;
import id.co.bankmandiri.nbds.model.LoginResponse;
import id.co.bankmandiri.nbds.model.LogoutRequest;
import id.co.bankmandiri.nbds.model.MenuDTORequest;
import id.co.bankmandiri.nbds.model.MenuDTOResponse;
import id.co.bankmandiri.nbds.model.RoleDTORequest;
import id.co.bankmandiri.nbds.model.RoleDTOResponse;
import id.co.bankmandiri.nbds.model.RoleMenuDTORequest;
import id.co.bankmandiri.nbds.model.RoleMenuDTOResponse;
import id.co.bankmandiri.nbds.model.UserBranchResponse;
import id.co.bankmandiri.nbds.model.UserBranchRoleDTORequest;
import id.co.bankmandiri.nbds.model.UserBranchRoleDTOResponse;
import id.co.bankmandiri.nbds.model.UserIdRequest;
import id.co.bankmandiri.nbds.model.VerificationRequest;
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
import id.co.bankmandiri.nbds.services.FingerprintUsingPOSTI;
import id.co.bankmandiri.nbds.model.FingerprintUsingPOSTP;
import id.co.bankmandiri.nbds.model.FingerprintUsingPOSTResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import id.co.bankmandiri.nbds.services.LoginUsingPOSTI;
import id.co.bankmandiri.nbds.model.LoginUsingPOSTP;
import id.co.bankmandiri.nbds.model.LoginUsingPOSTResponseWrapper;
import id.co.bankmandiri.nbds.services.LogoutUsingPOSTI;
import id.co.bankmandiri.nbds.model.LogoutUsingPOSTP;
import id.co.bankmandiri.nbds.model.LogoutUsingPOSTResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOSTI;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOSTP;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOSTResponseWrapper;
import id.co.bankmandiri.nbds.services.ResendOtpUsingPOSTI;
import id.co.bankmandiri.nbds.model.ResendOtpUsingPOSTP;
import id.co.bankmandiri.nbds.model.ResendOtpUsingPOSTResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOST1I;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST1P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST1ResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOST2I;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST2P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST2ResponseWrapper;
import id.co.bankmandiri.nbds.services.GetTellerListUsingGETI;
import id.co.bankmandiri.nbds.model.GetTellerListUsingGETP;
import id.co.bankmandiri.nbds.model.GetTellerListUsingGETResponseWrapper;
import id.co.bankmandiri.nbds.services.GetLoggedInTellerUsingGETI;
import id.co.bankmandiri.nbds.model.GetLoggedInTellerUsingGETP;
import id.co.bankmandiri.nbds.model.GetLoggedInTellerUsingGETResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOST3I;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST3P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST3ResponseWrapper;
import id.co.bankmandiri.nbds.services.GetTellerUserUsingGETI;
import id.co.bankmandiri.nbds.model.GetTellerUserUsingGETP;
import id.co.bankmandiri.nbds.model.GetTellerUserUsingGETResponseWrapper;
import id.co.bankmandiri.nbds.services.VerifyUsingPOSTI;
import id.co.bankmandiri.nbds.model.VerifyUsingPOSTP;
import id.co.bankmandiri.nbds.model.VerifyUsingPOSTResponseWrapper;

@RestController
public class AuthenticationApiController implements AuthenticationApi {

	@Autowired
	VerifyUsingPOSTI verifyUsingPOSTI;


	@Autowired
	GetTellerUserUsingGETI getTellerUserUsingGETI;


	@Autowired
	AddNewMenuUsingPOST3I addNewMenuUsingPOST3I;


	@Autowired
	GetLoggedInTellerUsingGETI getLoggedInTellerUsingGETI;


	@Autowired
	GetTellerListUsingGETI getTellerListUsingGETI;


	@Autowired
	AddNewMenuUsingPOST2I addNewMenuUsingPOST2I;


	@Autowired
	AddNewMenuUsingPOST1I addNewMenuUsingPOST1I;


	@Autowired
	ResendOtpUsingPOSTI resendOtpUsingPOSTI;


	@Autowired
	AddNewMenuUsingPOSTI addNewMenuUsingPOSTI;


	@Autowired
	LogoutUsingPOSTI logoutUsingPOSTI;


	@Autowired
	LoginUsingPOSTI loginUsingPOSTI;


	@Autowired
	FingerprintUsingPOSTI fingerprintUsingPOSTI;


    public ResponseEntity<MenuDTOResponse> addNewMenuUsingPOST(@ApiParam(value = "input" ,required=true )  @Valid @RequestBody MenuDTORequest menuDTORequest){
        
        AddNewMenuUsingPOSTResponseWrapper res  = addNewMenuUsingPOSTI.execute(new AddNewMenuUsingPOSTP(menuDTORequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RoleDTOResponse> addNewMenuUsingPOST1(@ApiParam(value = "input" ,required=true )  @Valid @RequestBody RoleDTORequest roleDTORequest){
        
        AddNewMenuUsingPOST1ResponseWrapper res  = addNewMenuUsingPOST1I.execute(new AddNewMenuUsingPOST1P(roleDTORequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<RoleMenuDTOResponse> addNewMenuUsingPOST2(@ApiParam(value = "input" ,required=true )  @Valid @RequestBody RoleMenuDTORequest roleMenuDTORequest){
        
        AddNewMenuUsingPOST2ResponseWrapper res  = addNewMenuUsingPOST2I.execute(new AddNewMenuUsingPOST2P(roleMenuDTORequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<UserBranchRoleDTOResponse> addNewMenuUsingPOST3(@ApiParam(value = "input" ,required=true )  @Valid @RequestBody UserBranchRoleDTORequest userBranchRoleDTORequest){
        
        AddNewMenuUsingPOST3ResponseWrapper res  = addNewMenuUsingPOST3I.execute(new AddNewMenuUsingPOST3P(userBranchRoleDTORequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<FingerprintResponse> fingerprintUsingPOST(@ApiParam(value = "input" ,required=true )  @Valid @RequestBody FingerprintRequest fingerprintRequest){
        
        FingerprintUsingPOSTResponseWrapper res  = fingerprintUsingPOSTI.execute(new FingerprintUsingPOSTP(fingerprintRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<BranchTellerCounterResponse> getLoggedInTellerUsingGET(@NotNull @ApiParam(value = "branchNumber", required = true) @Valid @RequestParam(value = "branchNumber", required = true) String branchNumber,@ApiParam(value = "loginStatus") @Valid @RequestParam(value = "loginStatus", required = false) Boolean loginStatus,@ApiParam(value = "role") @Valid @RequestParam(value = "role", required = false) String role){
        
        GetLoggedInTellerUsingGETResponseWrapper res  = getLoggedInTellerUsingGETI.execute(new GetLoggedInTellerUsingGETP(branchNumber, loginStatus, role));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<UserBranchResponse> getTellerListUsingGET(@NotNull @ApiParam(value = "Branch Number", required = true) @Valid @RequestParam(value = "branchNumber", required = true) String branchNumber,@ApiParam(value = "loginStatus") @Valid @RequestParam(value = "loginStatus", required = false) Boolean loginStatus,@ApiParam(value = "page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "role") @Valid @RequestParam(value = "role", required = false) String role,@ApiParam(value = "search") @Valid @RequestParam(value = "search", required = false) String search){
        
        GetTellerListUsingGETResponseWrapper res  = getTellerListUsingGETI.execute(new GetTellerListUsingGETP(branchNumber, loginStatus, page, role, search));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<GetTellerUserResponse> getTellerUserUsingGET(@ApiParam(value = "userId",required=true) @PathVariable("userId") String userId){
        
        GetTellerUserUsingGETResponseWrapper res  = getTellerUserUsingGETI.execute(new GetTellerUserUsingGETP(userId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Object> loginUsingPOST(@ApiParam(value = "authenticationRequest" ,required=true )  @Valid @RequestBody LoginRequest loginRequest){
        
        LoginUsingPOSTResponseWrapper res  = loginUsingPOSTI.execute(new LoginUsingPOSTP(loginRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Object> logoutUsingPOST(@ApiParam(value = "request" ,required=true )  @Valid @RequestBody LogoutRequest logoutRequest){
        
        LogoutUsingPOSTResponseWrapper res  = logoutUsingPOSTI.execute(new LogoutUsingPOSTP(logoutRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<LoginInitializationResponse> resendOtpUsingPOST(@ApiParam(value = "request" ,required=true )  @Valid @RequestBody UserIdRequest userIdRequest){
        
        ResendOtpUsingPOSTResponseWrapper res  = resendOtpUsingPOSTI.execute(new ResendOtpUsingPOSTP(userIdRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<LoginResponse> verifyUsingPOST(@ApiParam(value = "verificationRequest" ,required=true )  @Valid @RequestBody VerificationRequest verificationRequest){
        
        VerifyUsingPOSTResponseWrapper res  = verifyUsingPOSTI.execute(new VerifyUsingPOSTP(verificationRequest));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
