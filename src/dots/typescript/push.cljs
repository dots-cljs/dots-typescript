(ns dots.typescript.push
  "Array that is only intended to be pushed to, never read.")

(defn push
  ^js [push & values]
  (.. ^js push -push (apply ^js push (to-array values))))
