package jonatas.santos.project.learn.services;

import jonatas.santos.project.learn.entities.Andress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(url = "https://brasilapi.com.br/api/", name ="ApiCeps")
public interface FindCep {

   @GetMapping(value="cep/v1/{cep}" ,produces = "application/json;charset=utf-8")
   Andress getAndress(@PathVariable String cep);

}
