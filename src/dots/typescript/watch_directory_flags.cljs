(ns dots.typescript.watch-directory-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/WatchDirectoryFlags))

(def recursive (.-Recursive typescript/WatchDirectoryFlags))
