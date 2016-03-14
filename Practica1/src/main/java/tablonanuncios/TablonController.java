package tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonController {
	public static List<Anuncio> anuncios = new ArrayList<>();
	

	@RequestMapping("/")
	public String tablon(Model model) {
			
		model.addAttribute("anuncios", anuncios);

		return "tablon";
	}

}