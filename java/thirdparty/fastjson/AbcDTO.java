package my;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class AbcDTO {

    public static void main(String [] args) {
        AbcDTO abcDTO = JSON.parseObject("{}", AbcDTO.class);
    }

    private List<Alphabet> list100;
    private List<Alphabet> list101;
    private List<Alphabet> list102;
    private List<Alphabet> list103;
    private List<Alphabet> list104;
    private List<Alphabet> list105;
    private List<Alphabet> list106;
    private List<Alphabet> list107;
    private List<Alphabet> list108;
    private List<Alphabet> list109;
    private List<Alphabet> list110;
    private List<Alphabet> list111;
    private List<Alphabet> list112;
    private List<Alphabet> list113;
    private List<Alphabet> list114;
    private List<Alphabet> list115;
    private List<Alphabet> list116;
    private List<Alphabet> list117;
    private List<Alphabet> list118;
    private List<Alphabet> list119;
    private List<Alphabet> list120;
    private List<Alphabet> list121;
    private List<Alphabet> list122;
    private List<Alphabet> list123;
    private List<Alphabet> list124;
    private List<Alphabet> list125;
    private List<Alphabet> list126;
    private List<Alphabet> list127;
    private List<Alphabet> list128;
    private List<Alphabet> list129;
    private List<Alphabet> list130;
    private List<Alphabet> list131;
    private List<Alphabet> list132;
    private List<Alphabet> list133;
    private List<Alphabet> list134;
    private List<Alphabet> list135;
    private List<Alphabet> list136;
    private List<Alphabet> list137;
    private List<Alphabet> list138;
    private List<Alphabet> list139;
    private List<Alphabet> list140;
    private List<Alphabet> list141;
    private List<Alphabet> list142;
    private List<Alphabet> list143;
    private List<Alphabet> list144;
    private List<Alphabet> list145;
    private List<Alphabet> list146;
    private List<Alphabet> list147;
    private List<Alphabet> list148;
    private List<Alphabet> list149;
    private List<Alphabet> list150;
    private List<Alphabet> list151;
    private List<Alphabet> list152;
    private List<Alphabet> list153;
    private List<Alphabet> list154;
    private List<Alphabet> list155;
    private List<Alphabet> list156;
    private List<Alphabet> list157;
    private List<Alphabet> list158;
    private List<Alphabet> list159;
    private List<Alphabet> list160;
    private List<Alphabet> list161;
    private List<Alphabet> list162;
    private List<Alphabet> list163;


    @Data
    public static class Alphabet {
        private List<Double> a;
        private List<Double> b;
        private List<Double> c;
        private List<Double> d;
        private List<Double> e;
        private List<Double> f;
        private List<Double> g;
        private List<Double> h;
        private List<Double> i;
        private List<Double> j;
        private List<Double> k;
        private List<Double> l;
        private List<Double> m;
        private List<Double> n;
        private List<Double> o;
        private List<Double> p;
        private List<Double> q;
        private List<Double> r;
        private List<Double> s;
        private List<Double> t;
        private List<Double> u;
        private List<Double> v;
        private List<Double> w;
        private List<Double> x;
        private List<Double> y;
        private List<Double> z;
    }

}
