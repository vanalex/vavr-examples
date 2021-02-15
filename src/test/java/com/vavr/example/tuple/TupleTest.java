package com.vavr.example.tuple;

import io.vavr.*;
import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class TupleTest {

    @Test
    public void shouldCreateEmptyTuple() {
        assertThat(Tuple.empty().toString()).isEqualTo("()");
    }

    @Test
    public void shouldHashTuple0() {
        assertThat(tuple0().hashCode()).isEqualTo(Objects.hash());
    }

    @Test
    public void shouldReturnCorrectArityOfTuple0() {
        assertThat(tuple0().arity()).isEqualTo(0);
    }

    @Test
    public void shouldReturnCorrectSeqOfTuple0() {
        assertThat(tuple0().toSeq()).isEqualTo(List.empty());
    }

    @SuppressWarnings("EqualsWithItself")
    @Test
    public void shouldEqualSameTuple0Instances() {
        final Tuple0 t = tuple0();
        assertThat(t.equals(t)).isTrue();
    }

    @SuppressWarnings("ObjectEqualsNull")
    @Test
    public void shouldNotTuple0EqualsNull() {
        assertThat(tuple0().equals(null)).isFalse();
    }

    @Test
    public void shouldNotTuple0EqualsObject() {
        assertThat(tuple0().equals(new Object())).isFalse();
    }

    @SuppressWarnings("EqualsWithItself")
    @Test
    public void shouldTuple0EqualTuple0() {
        assertThat(tuple0().equals(tuple0())).isTrue();
    }

    @Test
    public void shouldReturnComparator() {
        assertThat(Tuple0.comparator().compare(Tuple0.instance(), Tuple0.instance())).isEqualTo(0);
    }

    @Test
    public void shouldApplyTuple0() {
        assertThat(Tuple0.instance().apply(() -> 1) == 1).isTrue();
    }

    @Test
    public void shouldCreateSingle() {
        assertThat(tuple1().toString()).isEqualTo("(1)");
    }

    @Test
    public void shouldHashTuple1() {
        final Tuple1<?> t = tuple1();
        assertThat(t.hashCode()).isEqualTo(Tuple.hash(t._1));
    }

    @Test
    public void shouldReturnCorrectArityOfTuple1() {
        assertThat(tuple1().arity()).isEqualTo(1);
    }

    @SuppressWarnings("EqualsWithItself")
    @Test
    public void shouldEqualSameTuple1Instances() {
        final Tuple1<?> t = tuple1();
        assertThat(t.equals(t)).isTrue();
    }

    @SuppressWarnings("ObjectEqualsNull")
    @Test
    public void shouldNotTuple1EqualsNull() {
        assertThat(tuple1().equals(null)).isFalse();
    }

    @Test
    public void shouldNotTuple1EqualsObject() {
        assertThat(tuple1().equals(new Object())).isFalse();
    }

    @Test
    public void shouldTuple1EqualTuple1() {
        assertThat(tuple1().equals(tuple1())).isTrue();
    }

    @Test
    public void shouldNarrowTuple1() {
        final Tuple1<Double> wideTuple = Tuple.of(1.0d);
        final Tuple1<Number> narrowTuple = Tuple.narrow(wideTuple);
        assertThat(narrowTuple._1()).isEqualTo(1.0d);
    }


    private Tuple0 tuple0() {
        return Tuple.empty();
    }

    private Tuple1<?> tuple1() {
        return Tuple.of(1);
    }

    private Tuple2<?, ?> tuple2() {
        return Tuple.of(1, 2);
    }

    private Tuple3<?, ?, ?> tuple3() {
        return Tuple.of(1, 2, 3);
    }

    private Tuple4<?, ?, ?, ?> tuple4() {
        return Tuple.of(1, 2, 3, 4);
    }

    private Tuple5<?, ?, ?, ?, ?> tuple5() {
        return Tuple.of(1, 2, 3, 4, 5);
    }

    private Tuple6<?, ?, ?, ?, ?, ?> tuple6() {
        return Tuple.of(1, 2, 3, 4, 5, 6);
    }

    private Tuple7<?, ?, ?, ?, ?, ?, ?> tuple7() {
        return Tuple.of(1, 2, 3, 4, 5, 6, 7);
    }

    private Tuple8<?, ?, ?, ?, ?, ?, ?, ?> tuple8() {
        return Tuple.of(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
