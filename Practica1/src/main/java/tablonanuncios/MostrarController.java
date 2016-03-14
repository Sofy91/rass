package tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MostrarController {

	@RequestMapping("/mostrar")
	public String mostrar(@RequestParam int numAnuncio, Model model) {

		Anuncio anuncio = TablonController.anuncios.get(numAnuncio);

		model.addAttribute("anuncio", anuncio);

		return "mostrar";
	}
}