package com.food.ordering.system.kafka.consumer;

import org.apache.avro.specific.SpecificRecordBase;

import java.util.List;

public interface KafkaConsumer<T extends SpecificRecordBase> {
    void recieve(List<T> message, List<Long> keys, List<Integer> partitions, List<Long> offsets);
}
