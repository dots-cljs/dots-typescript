(ns dots.typescript.call-signature-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [call-signature-declaration]
  (.-kind ^js call-signature-declaration))

(defn name
  ^js [call-signature-declaration]
  (.-name ^js call-signature-declaration))

(defn type-parameters
  ^js [call-signature-declaration]
  (.-typeParameters ^js call-signature-declaration))

(defn parameters
  ^js [call-signature-declaration]
  (.-parameters ^js call-signature-declaration))

(defn type
  ^js [call-signature-declaration]
  (.-type ^js call-signature-declaration))

(defn flags
  ^js [call-signature-declaration]
  (.-flags ^js call-signature-declaration))

(defn parent
  ^js [call-signature-declaration]
  (.-parent ^js call-signature-declaration))

(defn source-file
  ^js [call-signature-declaration]
  (.getSourceFile ^js call-signature-declaration))

(defn child-count
  (^js [call-signature-declaration]
   (.getChildCount ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getChildCount ^js call-signature-declaration source-file)))

(defn child-at
  (^js [call-signature-declaration index]
   (.getChildAt ^js call-signature-declaration index))
  (^js [call-signature-declaration index source-file]
   (.getChildAt ^js call-signature-declaration index source-file)))

(defn children
  (^js [call-signature-declaration]
   (.getChildren ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getChildren ^js call-signature-declaration source-file)))

(defn start
  (^js [call-signature-declaration]
   (.getStart ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getStart ^js call-signature-declaration source-file))
  (^js [call-signature-declaration source-file include-js-doc-comment?]
   (.getStart ^js call-signature-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [call-signature-declaration]
  (.getFullStart ^js call-signature-declaration))

(defn get-end
  ^js [call-signature-declaration]
  (.getEnd ^js call-signature-declaration))

(defn width
  (^js [call-signature-declaration]
   (.getWidth ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getWidth ^js call-signature-declaration source-file)))

(defn full-width
  ^js [call-signature-declaration]
  (.getFullWidth ^js call-signature-declaration))

(defn leading-trivia-width
  (^js [call-signature-declaration]
   (.getLeadingTriviaWidth ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getLeadingTriviaWidth ^js call-signature-declaration source-file)))

(defn full-text
  (^js [call-signature-declaration]
   (.getFullText ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getFullText ^js call-signature-declaration source-file)))

(defn text
  (^js [call-signature-declaration]
   (.getText ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getText ^js call-signature-declaration source-file)))

(defn first-token
  (^js [call-signature-declaration]
   (.getFirstToken ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getFirstToken ^js call-signature-declaration source-file)))

(defn last-token
  (^js [call-signature-declaration]
   (.getLastToken ^js call-signature-declaration))
  (^js [call-signature-declaration source-file]
   (.getLastToken ^js call-signature-declaration source-file)))

(defn for-each-child
  (^js [call-signature-declaration cb-node]
   (.forEachChild ^js call-signature-declaration cb-node))
  (^js [call-signature-declaration cb-node cb-node-array]
   (.forEachChild ^js call-signature-declaration cb-node cb-node-array)))

(defn decorators
  ^js [call-signature-declaration]
  (.-decorators ^js call-signature-declaration))

(defn modifiers
  ^js [call-signature-declaration]
  (.-modifiers ^js call-signature-declaration))

(defn pos
  ^js [call-signature-declaration]
  (.-pos ^js call-signature-declaration))

(defn end
  ^js [call-signature-declaration]
  (.-end ^js call-signature-declaration))

(defn question-token
  ^js [call-signature-declaration]
  (.-questionToken ^js call-signature-declaration))
