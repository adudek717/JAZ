package pl.pjatk.aledud;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class JazRestController {

    private MyClassOne myClassOne;

    public JazRestController(MyClassOne myClassOne) {
        this.myClassOne = myClassOne;
    }

    @GetMapping("/greeting")
    public ResponseEntity<MyClassOne> greeting() {
        return ResponseEntity.ok(myClassOne);
    }

    @GetMapping("/greeting/{someValue}")
    public ResponseEntity<String> greeting(@PathVariable("someValue") String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/greeting/hello")
    public ResponseEntity<String> requestGreeting(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PostMapping("/model")
    public ResponseEntity<MyClassOne> postModel(@RequestBody MyClassOne myClassOne) {
       return ResponseEntity.ok(myClassOne);
    }
}
