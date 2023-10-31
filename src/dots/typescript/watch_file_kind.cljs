(ns dots.typescript.watch-file-kind
  (:require ["typescript" :as typescript]))

(def fixed-polling-interval (.-FixedPollingInterval typescript/WatchFileKind))

(def priority-polling-interval (.-PriorityPollingInterval typescript/WatchFileKind))

(def dynamic-priority-polling (.-DynamicPriorityPolling typescript/WatchFileKind))

(def fixed-chunk-size-polling (.-FixedChunkSizePolling typescript/WatchFileKind))

(def use-fs-events (.-UseFsEvents typescript/WatchFileKind))

(def use-fs-events-on-parent-directory (.-UseFsEventsOnParentDirectory typescript/WatchFileKind))
