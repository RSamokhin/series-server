package series.controllers;

import org.springframework.web.bind.annotation.*;
import series.models.Title;

import java.util.ArrayList;

import static com.jsoniter.JsonIterator.deserialize;

@RestController
public class TitleController {

    @RequestMapping(value = "/titles", method = RequestMethod.GET)
    @ResponseBody
    public Title[] getTitles() {
            ArrayList<Title> titlesArrayList = new ArrayList<>();
            titlesArrayList.add(new Title(
                    "t0001",
                    "series",
                    "Игра Престолов",
                    "Game Of Thrones"
            ));
            titlesArrayList.add(new Title(
                    "t0002",
                    "series",
                    "Ходячие мертвецы",
                    "Walking dead"
            ));
            Title[] titles = new Title[titlesArrayList.size()];
            return titlesArrayList.toArray(titles);
    }

    @RequestMapping(value="titles/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Title getTitleById(@PathVariable String id) {

        String titleJSON = "{\"id\": \"t0002\", \"titleType\": \"series\", \"primaryTitle\": \"Ходячие мертвецы\", \"originalTitle\": \"Walking dead\"}";
        Title title = deserialize(titleJSON, Title.class);

        return title;
    }
}