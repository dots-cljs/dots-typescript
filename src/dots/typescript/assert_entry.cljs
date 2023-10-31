(ns dots.typescript.assert-entry
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [assert-entry]
  (.-kind ^js assert-entry))

(defn parent
  ^js [assert-entry]
  (.-parent ^js assert-entry))

(defn name
  ^js [assert-entry]
  (.-name ^js assert-entry))

(defn value
  ^js [assert-entry]
  (.-value ^js assert-entry))

(defn flags
  ^js [assert-entry]
  (.-flags ^js assert-entry))

(defn source-file
  ^js [assert-entry]
  (.getSourceFile ^js assert-entry))

(defn child-count
  (^js [assert-entry]
   (.getChildCount ^js assert-entry))
  (^js [assert-entry source-file]
   (.getChildCount ^js assert-entry source-file)))

(defn child-at
  (^js [assert-entry index]
   (.getChildAt ^js assert-entry index))
  (^js [assert-entry index source-file]
   (.getChildAt ^js assert-entry index source-file)))

(defn children
  (^js [assert-entry]
   (.getChildren ^js assert-entry))
  (^js [assert-entry source-file]
   (.getChildren ^js assert-entry source-file)))

(defn start
  (^js [assert-entry]
   (.getStart ^js assert-entry))
  (^js [assert-entry source-file]
   (.getStart ^js assert-entry source-file))
  (^js [assert-entry source-file include-js-doc-comment?]
   (.getStart ^js assert-entry source-file include-js-doc-comment?)))

(defn full-start
  ^js [assert-entry]
  (.getFullStart ^js assert-entry))

(defn get-end
  ^js [assert-entry]
  (.getEnd ^js assert-entry))

(defn width
  (^js [assert-entry]
   (.getWidth ^js assert-entry))
  (^js [assert-entry source-file]
   (.getWidth ^js assert-entry source-file)))

(defn full-width
  ^js [assert-entry]
  (.getFullWidth ^js assert-entry))

(defn leading-trivia-width
  (^js [assert-entry]
   (.getLeadingTriviaWidth ^js assert-entry))
  (^js [assert-entry source-file]
   (.getLeadingTriviaWidth ^js assert-entry source-file)))

(defn full-text
  (^js [assert-entry]
   (.getFullText ^js assert-entry))
  (^js [assert-entry source-file]
   (.getFullText ^js assert-entry source-file)))

(defn text
  (^js [assert-entry]
   (.getText ^js assert-entry))
  (^js [assert-entry source-file]
   (.getText ^js assert-entry source-file)))

(defn first-token
  (^js [assert-entry]
   (.getFirstToken ^js assert-entry))
  (^js [assert-entry source-file]
   (.getFirstToken ^js assert-entry source-file)))

(defn last-token
  (^js [assert-entry]
   (.getLastToken ^js assert-entry))
  (^js [assert-entry source-file]
   (.getLastToken ^js assert-entry source-file)))

(defn for-each-child
  (^js [assert-entry cb-node]
   (.forEachChild ^js assert-entry cb-node))
  (^js [assert-entry cb-node cb-node-array]
   (.forEachChild ^js assert-entry cb-node cb-node-array)))

(defn pos
  ^js [assert-entry]
  (.-pos ^js assert-entry))

(defn end
  ^js [assert-entry]
  (.-end ^js assert-entry))
