(ns dots.typescript.project-reference)

(defn path
  "A normalized path on disk
   
   **Returns:** `string`"
  ^js [project-reference]
  (.-path ^js project-reference))

(defn set-path!
  "A normalized path on disk"
  ^js [project-reference value]
  (set! (.-path ^js project-reference) value))

(defn original-path
  "The path as the user originally wrote it
   
   **Returns:** `string | undefined`"
  ^js [project-reference]
  (.-originalPath ^js project-reference))

(defn set-original-path!
  "The path as the user originally wrote it"
  ^js [project-reference value]
  (set! (.-originalPath ^js project-reference) value))

(defn prepend?
  "True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations
   
   **Returns:** `boolean | undefined`"
  ^js [project-reference]
  (.-prepend ^js project-reference))

(defn set-prepend!
  "True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations"
  ^js [project-reference value]
  (set! (.-prepend ^js project-reference) value))

(defn circular?
  "True if it is intended that this reference form a circularity
   
   **Returns:** `boolean | undefined`"
  ^js [project-reference]
  (.-circular ^js project-reference))

(defn set-circular!
  "True if it is intended that this reference form a circularity"
  ^js [project-reference value]
  (set! (.-circular ^js project-reference) value))
