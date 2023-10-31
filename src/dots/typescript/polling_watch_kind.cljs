(ns dots.typescript.polling-watch-kind
  (:require ["typescript" :as typescript]))

(def fixed-interval (.-FixedInterval typescript/PollingWatchKind))

(def priority-interval (.-PriorityInterval typescript/PollingWatchKind))

(def dynamic-priority (.-DynamicPriority typescript/PollingWatchKind))

(def fixed-chunk-size (.-FixedChunkSize typescript/PollingWatchKind))
