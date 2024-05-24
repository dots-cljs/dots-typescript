(ns dots.typescript.server.msg
  (:require ["typescript" :as typescript]))

(def err (.. typescript/server -Msg -Err))

(def info (.. typescript/server -Msg -Info))

(def perf (.. typescript/server -Msg -Perf))
