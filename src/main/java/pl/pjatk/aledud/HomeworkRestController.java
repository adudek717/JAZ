package pl.pjatk.aledud;

        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    private MyClassOne myClassOne;

    public HomeworkRestController(MyClassOne myClassOne) {
        this.myClassOne = myClassOne;
    }


    @GetMapping("/{someValue}")
    public ResponseEntity<String> getGreeting(@PathVariable("someValue") String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("")
    public ResponseEntity<String> getRequestGreeting(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/put/{someValue}")
    public ResponseEntity<MyClassOne> putGreeting(@PathVariable String someValue, @RequestBody MyClassOne myClassOne) {
        myClassOne.setName(someValue);
        return ResponseEntity.ok(myClassOne);
    }

    @PostMapping("/post")
    public ResponseEntity<MyClassOne> postGreeting(@RequestBody MyClassOne myClassOne) {
        return ResponseEntity.ok(myClassOne);
    }

    @DeleteMapping("/delete/{someValue}")
    public ResponseEntity<HttpStatus> deleteGreeting(@PathVariable("someValue") String someValue) {
        return ResponseEntity.ok(HttpStatus.OK);
    }
}