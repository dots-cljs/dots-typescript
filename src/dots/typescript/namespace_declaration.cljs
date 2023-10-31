(ns dots.typescript.namespace-declaration
  (:refer-clojure :exclude [name]))

(defn name
  ^js [namespace-declaration]
  (.-name ^js namespace-declaration))

(defn body
  ^js [namespace-declaration]
  (.-body ^js namespace-declaration))

(defn kind
  ^js [namespace-declaration]
  (.-kind ^js namespace-declaration))

(defn parent
  ^js [namespace-declaration]
  (.-parent ^js namespace-declaration))

(defn modifiers
  ^js [namespace-declaration]
  (.-modifiers ^js namespace-declaration))

(defn flags
  ^js [namespace-declaration]
  (.-flags ^js namespace-declaration))

(defn source-file
  ^js [namespace-declaration]
  (.getSourceFile ^js namespace-declaration))

(defn child-count
  (^js [namespace-declaration]
   (.getChildCount ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getChildCount ^js namespace-declaration source-file)))

(defn child-at
  (^js [namespace-declaration index]
   (.getChildAt ^js namespace-declaration index))
  (^js [namespace-declaration index source-file]
   (.getChildAt ^js namespace-declaration index source-file)))

(defn children
  (^js [namespace-declaration]
   (.getChildren ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getChildren ^js namespace-declaration source-file)))

(defn start
  (^js [namespace-declaration]
   (.getStart ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getStart ^js namespace-declaration source-file))
  (^js [namespace-declaration source-file include-js-doc-comment?]
   (.getStart ^js namespace-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [namespace-declaration]
  (.getFullStart ^js namespace-declaration))

(defn get-end
  ^js [namespace-declaration]
  (.getEnd ^js namespace-declaration))

(defn width
  (^js [namespace-declaration]
   (.getWidth ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getWidth ^js namespace-declaration source-file)))

(defn full-width
  ^js [namespace-declaration]
  (.getFullWidth ^js namespace-declaration))

(defn leading-trivia-width
  (^js [namespace-declaration]
   (.getLeadingTriviaWidth ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getLeadingTriviaWidth ^js namespace-declaration source-file)))

(defn full-text
  (^js [namespace-declaration]
   (.getFullText ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getFullText ^js namespace-declaration source-file)))

(defn text
  (^js [namespace-declaration]
   (.getText ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getText ^js namespace-declaration source-file)))

(defn first-token
  (^js [namespace-declaration]
   (.getFirstToken ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getFirstToken ^js namespace-declaration source-file)))

(defn last-token
  (^js [namespace-declaration]
   (.getLastToken ^js namespace-declaration))
  (^js [namespace-declaration source-file]
   (.getLastToken ^js namespace-declaration source-file)))

(defn for-each-child
  (^js [namespace-declaration cb-node]
   (.forEachChild ^js namespace-declaration cb-node))
  (^js [namespace-declaration cb-node cb-node-array]
   (.forEachChild ^js namespace-declaration cb-node cb-node-array)))

(defn decorators
  ^js [namespace-declaration]
  (.-decorators ^js namespace-declaration))

(defn pos
  ^js [namespace-declaration]
  (.-pos ^js namespace-declaration))

(defn end
  ^js [namespace-declaration]
  (.-end ^js namespace-declaration))
