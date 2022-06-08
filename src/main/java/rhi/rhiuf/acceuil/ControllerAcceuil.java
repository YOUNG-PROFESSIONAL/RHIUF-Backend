package rhi.rhiuf.acceuil;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rhi.rhiuf.ApiResponse;

@CrossOrigin(value = "http://localhost:4200")
@RestController()
@RequestMapping(path = "/acceuil")
public class ControllerAcceuil {
    @Autowired
    private ServiceAcceuil serviceAcceuil;

    @GetMapping
    public ResponseEntity<ApiResponse> acceuil(){
        System.out.println(this.serviceAcceuil.getBiographies());
        return ResponseEntity.ok(
            ApiResponse.builder()
                    .apiTimestamp(LocalDateTime.now())
                    .apiData(Map.of("datas", this.serviceAcceuil.getBiographies()))
                    .apiStatus(HttpStatus.valueOf(200))
                    .apiMessage("Acceuil retrieved!")
            .build());
    }
}
