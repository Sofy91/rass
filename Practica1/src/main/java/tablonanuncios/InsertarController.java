package tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertarController {


	@RequestMapping("/insertar")
	public String insertar(Anuncio anuncio, Model model) {

		TablonController.anuncios.add(anuncio);

		return "insertar";
	}

}