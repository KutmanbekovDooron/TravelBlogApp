package itacademy.kg.travelblogapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Dictionery> dictioneries;

    PlaceAdabtor placeAdabtor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addPlace();
        recyclerView();
    }

    private void recyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycl);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        placeAdabtor = new PlaceAdabtor(dictioneries);

        recyclerView.setAdapter(placeAdabtor);

    }

    private void addPlace() {
        dictioneries = new ArrayList<>();
        dictioneries.add(new Dictionery(R.drawable.picture,"Долина Йосемити, США","Топ самых красивых мест открывает поистине райское место на земле — живописнейшая долина ледникового происхождения в штате Калифорния. Горную местность долины украшает обилие хрустальных водопадов, чистейших озёр и бурной растительности."));
        dictioneries.add(new Dictionery(R.drawable.picture2,"Цветные скалы Чжанъе Данксиа, Китай","Геологический парк в китайской провинции Ганьсу известен необычным природным сокровищем — красочными горными образованиями из разноцветных пород песчаника и конгломератов, относящихся преимущественно к Меловому периоду."));
        dictioneries.add(new Dictionery(R.drawable.picture3,"Бамбуковый лес, Япония","В сердце городских ландшафтов Киото расположился живописный уголок природы — густая бамбуковая роща, состоящая из бесчисленного количества бамбуковых деревьев. На внушительной площади есть где разгуляться, поэтому лес стал излюбленным местом отдыха горожан и приезжих."));
        dictioneries.add(new Dictionery(R.drawable.picture4,"Монастырский комплекс Метеоры, Греция","Уникальные монастыри буквально вырастают из горной породы, венчая вершины скал. Сами скалы являются частью древней горной системы Фессалии, расположенной в историческом регионе Греции."));
        dictioneries.add(new Dictionery(R.drawable.picture5,"Салар де Юни, Боливия","На юге высокогорной пустыни, на плато Альтипано, когда-то находилось солёное озеро. Позже оно пересохло, оголив солёное дно. Толщина пласта соли составляет от 2 до 8 метров, и в сезон дождей, когда поверхность этого пласта покрывает слой воды, солончак Юни становится подобным гигантскому зеркалу: гладь озера сливается с синевой неба, и окружающие ландшафты обретают поистине неземную красоту."));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {
            case R.id.share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Share web site");
                String shareMessage= "\nLet me recommend you this application";
                shareMessage = shareMessage + "https://www.tripzaza.com/ru/destinations/samyie-krasivyie-mesta-mira/" + BuildConfig.APPLICATION_ID +"";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "choose one"));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}