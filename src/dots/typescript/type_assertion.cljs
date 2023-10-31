(ns dots.typescript.type-assertion
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [type-assertion]
  (.-kind ^js type-assertion))

(defn type
  ^js [type-assertion]
  (.-type ^js type-assertion))

(defn expression
  ^js [type-assertion]
  (.-expression ^js type-assertion))

(defn flags
  ^js [type-assertion]
  (.-flags ^js type-assertion))

(defn parent
  ^js [type-assertion]
  (.-parent ^js type-assertion))

(defn source-file
  ^js [type-assertion]
  (.getSourceFile ^js type-assertion))

(defn child-count
  (^js [type-assertion]
   (.getChildCount ^js type-assertion))
  (^js [type-assertion source-file]
   (.getChildCount ^js type-assertion source-file)))

(defn child-at
  (^js [type-assertion index]
   (.getChildAt ^js type-assertion index))
  (^js [type-assertion index source-file]
   (.getChildAt ^js type-assertion index source-file)))

(defn children
  (^js [type-assertion]
   (.getChildren ^js type-assertion))
  (^js [type-assertion source-file]
   (.getChildren ^js type-assertion source-file)))

(defn start
  (^js [type-assertion]
   (.getStart ^js type-assertion))
  (^js [type-assertion source-file]
   (.getStart ^js type-assertion source-file))
  (^js [type-assertion source-file include-js-doc-comment?]
   (.getStart ^js type-assertion source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-assertion]
  (.getFullStart ^js type-assertion))

(defn get-end
  ^js [type-assertion]
  (.getEnd ^js type-assertion))

(defn width
  (^js [type-assertion]
   (.getWidth ^js type-assertion))
  (^js [type-assertion source-file]
   (.getWidth ^js type-assertion source-file)))

(defn full-width
  ^js [type-assertion]
  (.getFullWidth ^js type-assertion))

(defn leading-trivia-width
  (^js [type-assertion]
   (.getLeadingTriviaWidth ^js type-assertion))
  (^js [type-assertion source-file]
   (.getLeadingTriviaWidth ^js type-assertion source-file)))

(defn full-text
  (^js [type-assertion]
   (.getFullText ^js type-assertion))
  (^js [type-assertion source-file]
   (.getFullText ^js type-assertion source-file)))

(defn text
  (^js [type-assertion]
   (.getText ^js type-assertion))
  (^js [type-assertion source-file]
   (.getText ^js type-assertion source-file)))

(defn first-token
  (^js [type-assertion]
   (.getFirstToken ^js type-assertion))
  (^js [type-assertion source-file]
   (.getFirstToken ^js type-assertion source-file)))

(defn last-token
  (^js [type-assertion]
   (.getLastToken ^js type-assertion))
  (^js [type-assertion source-file]
   (.getLastToken ^js type-assertion source-file)))

(defn for-each-child
  (^js [type-assertion cb-node]
   (.forEachChild ^js type-assertion cb-node))
  (^js [type-assertion cb-node cb-node-array]
   (.forEachChild ^js type-assertion cb-node cb-node-array)))

(defn decorators
  ^js [type-assertion]
  (.-decorators ^js type-assertion))

(defn modifiers
  ^js [type-assertion]
  (.-modifiers ^js type-assertion))

(defn pos
  ^js [type-assertion]
  (.-pos ^js type-assertion))

(defn end
  ^js [type-assertion]
  (.-end ^js type-assertion))
