(ns dots.typescript.server.protocol.navigation-tree
  "protocol.NavigationTree is identical to ts.NavigationTree, except using protocol.TextSpan instead of ts.TextSpan")

(defn text
  "**Returns:** `string`"
  ^js [navigation-tree]
  (.-text ^js navigation-tree))

(defn set-text!
  ^js [navigation-tree value]
  (set! (.-text ^js navigation-tree) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [navigation-tree]
  (.-kind ^js navigation-tree))

(defn set-kind!
  ^js [navigation-tree value]
  (set! (.-kind ^js navigation-tree) value))

(defn kind-modifiers
  "**Returns:** `string`"
  ^js [navigation-tree]
  (.-kindModifiers ^js navigation-tree))

(defn set-kind-modifiers!
  ^js [navigation-tree value]
  (set! (.-kindModifiers ^js navigation-tree) value))

(defn spans
  "**Returns:** `TextSpan[]`"
  ^js [navigation-tree]
  (.-spans ^js navigation-tree))

(defn set-spans!
  ^js [navigation-tree value]
  (set! (.-spans ^js navigation-tree) value))

(defn name-span
  "**Returns:** `TextSpan | undefined`"
  ^js [navigation-tree]
  (.-nameSpan ^js navigation-tree))

(defn set-name-span!
  ^js [navigation-tree value]
  (set! (.-nameSpan ^js navigation-tree) value))

(defn child-items
  "**Returns:** `NavigationTree[] | undefined`"
  ^js [navigation-tree]
  (.-childItems ^js navigation-tree))

(defn set-child-items!
  ^js [navigation-tree value]
  (set! (.-childItems ^js navigation-tree) value))
