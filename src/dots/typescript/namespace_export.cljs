(ns dots.typescript.namespace-export
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [namespace-export]
  (.-kind ^js namespace-export))

(defn parent
  ^js [namespace-export]
  (.-parent ^js namespace-export))

(defn name
  ^js [namespace-export]
  (.-name ^js namespace-export))

(defn flags
  ^js [namespace-export]
  (.-flags ^js namespace-export))

(defn source-file
  ^js [namespace-export]
  (.getSourceFile ^js namespace-export))

(defn child-count
  (^js [namespace-export]
   (.getChildCount ^js namespace-export))
  (^js [namespace-export source-file]
   (.getChildCount ^js namespace-export source-file)))

(defn child-at
  (^js [namespace-export index]
   (.getChildAt ^js namespace-export index))
  (^js [namespace-export index source-file]
   (.getChildAt ^js namespace-export index source-file)))

(defn children
  (^js [namespace-export]
   (.getChildren ^js namespace-export))
  (^js [namespace-export source-file]
   (.getChildren ^js namespace-export source-file)))

(defn start
  (^js [namespace-export]
   (.getStart ^js namespace-export))
  (^js [namespace-export source-file]
   (.getStart ^js namespace-export source-file))
  (^js [namespace-export source-file include-js-doc-comment?]
   (.getStart ^js namespace-export source-file include-js-doc-comment?)))

(defn full-start
  ^js [namespace-export]
  (.getFullStart ^js namespace-export))

(defn get-end
  ^js [namespace-export]
  (.getEnd ^js namespace-export))

(defn width
  (^js [namespace-export]
   (.getWidth ^js namespace-export))
  (^js [namespace-export source-file]
   (.getWidth ^js namespace-export source-file)))

(defn full-width
  ^js [namespace-export]
  (.getFullWidth ^js namespace-export))

(defn leading-trivia-width
  (^js [namespace-export]
   (.getLeadingTriviaWidth ^js namespace-export))
  (^js [namespace-export source-file]
   (.getLeadingTriviaWidth ^js namespace-export source-file)))

(defn full-text
  (^js [namespace-export]
   (.getFullText ^js namespace-export))
  (^js [namespace-export source-file]
   (.getFullText ^js namespace-export source-file)))

(defn text
  (^js [namespace-export]
   (.getText ^js namespace-export))
  (^js [namespace-export source-file]
   (.getText ^js namespace-export source-file)))

(defn first-token
  (^js [namespace-export]
   (.getFirstToken ^js namespace-export))
  (^js [namespace-export source-file]
   (.getFirstToken ^js namespace-export source-file)))

(defn last-token
  (^js [namespace-export]
   (.getLastToken ^js namespace-export))
  (^js [namespace-export source-file]
   (.getLastToken ^js namespace-export source-file)))

(defn for-each-child
  (^js [namespace-export cb-node]
   (.forEachChild ^js namespace-export cb-node))
  (^js [namespace-export cb-node cb-node-array]
   (.forEachChild ^js namespace-export cb-node cb-node-array)))

(defn decorators
  ^js [namespace-export]
  (.-decorators ^js namespace-export))

(defn modifiers
  ^js [namespace-export]
  (.-modifiers ^js namespace-export))

(defn pos
  ^js [namespace-export]
  (.-pos ^js namespace-export))

(defn end
  ^js [namespace-export]
  (.-end ^js namespace-export))
