(ns dots.typescript.server.protocol.polling-watch-kind
  (:require ["typescript" :as typescript]))

(def fixed-interval (.. typescript/server -protocol -PollingWatchKind -FixedInterval))

(def priority-interval (.. typescript/server -protocol -PollingWatchKind -PriorityInterval))

(def dynamic-priority (.. typescript/server -protocol -PollingWatchKind -DynamicPriority))

(def fixed-chunk-size (.. typescript/server -protocol -PollingWatchKind -FixedChunkSize))
