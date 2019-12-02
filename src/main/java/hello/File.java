package hello;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class File {

  @PostMapping("")
  public String test(@RequestParam("file") MultipartFile file) throws Exception {


    byte[] bytes = file.getBytes();
    ByteArrayInputStream inputFilestream = new ByteArrayInputStream(bytes);
    BufferedReader br = new BufferedReader(new InputStreamReader(inputFilestream ));
    String line = "";
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
    br.close();



    return line;
  }


}
