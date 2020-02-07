package fr.epsi.android.controleur;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import fr.epsi.androidcontroleur.PromotionControleur;


public class PromotionControleurTest {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new PromotionControleur()).build();
    }

    @Test
    public void lApiWebRenvoieUnFichierJSONSurUnAppel() throws Exception {
        mockMvc.perform(get("/gostyle/promotion").contentType(MediaType.APPLICATION_JSON)
                       .content("{\"code\":\"IOBI7488\",\"description\":\"Produit test\",\"lien\":\"http://epsi.fr\"}")).
                andExpect(status().isOk());
    }

}