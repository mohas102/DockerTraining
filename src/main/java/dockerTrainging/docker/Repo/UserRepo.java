package dockerTrainging.docker.Repo;

import dockerTrainging.docker.model.Userr;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Userr,Long> {
}
