package tr.edu.medipol.yova.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

// http://localhost:8080/ogrenci/listele

@RestController             		// Rest web servis sinifi ozelligi kazandiriyoruz
@RequestMapping("/ogrenci") 		// "/ogrenci" ile baslayana web isteklerini bu sinifa yonlendirir
public class OgrenciRestApi {

	private static final List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
	}
	
	@GetMapping("/listele")
	public List<String> listele() {
		return OGRENCILER;
	}
}
