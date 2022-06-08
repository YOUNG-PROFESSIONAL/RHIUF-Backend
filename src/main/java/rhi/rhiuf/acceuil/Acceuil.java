package rhi.rhiuf.acceuil;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rhi.rhiuf.dashboard.bio.Bio;

@Data @NoArgsConstructor @AllArgsConstructor
public class Acceuil {
    public List<Bio> biographies;
}
