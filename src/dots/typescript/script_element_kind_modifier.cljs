(ns dots.typescript.script-element-kind-modifier
  (:require ["typescript" :as typescript]))

(def none (.-none typescript/ScriptElementKindModifier))

(def public-member-modifier (.-publicMemberModifier typescript/ScriptElementKindModifier))

(def private-member-modifier (.-privateMemberModifier typescript/ScriptElementKindModifier))

(def protected-member-modifier (.-protectedMemberModifier typescript/ScriptElementKindModifier))

(def exported-modifier (.-exportedModifier typescript/ScriptElementKindModifier))

(def ambient-modifier (.-ambientModifier typescript/ScriptElementKindModifier))

(def static-modifier (.-staticModifier typescript/ScriptElementKindModifier))

(def abstract-modifier (.-abstractModifier typescript/ScriptElementKindModifier))

(def optional-modifier (.-optionalModifier typescript/ScriptElementKindModifier))

(def deprecated-modifier (.-deprecatedModifier typescript/ScriptElementKindModifier))

(def dts-modifier (.-dtsModifier typescript/ScriptElementKindModifier))

(def ts-modifier (.-tsModifier typescript/ScriptElementKindModifier))

(def tsx-modifier (.-tsxModifier typescript/ScriptElementKindModifier))

(def js-modifier (.-jsModifier typescript/ScriptElementKindModifier))

(def jsx-modifier (.-jsxModifier typescript/ScriptElementKindModifier))

(def json-modifier (.-jsonModifier typescript/ScriptElementKindModifier))

(def dmts-modifier (.-dmtsModifier typescript/ScriptElementKindModifier))

(def mts-modifier (.-mtsModifier typescript/ScriptElementKindModifier))

(def mjs-modifier (.-mjsModifier typescript/ScriptElementKindModifier))

(def dcts-modifier (.-dctsModifier typescript/ScriptElementKindModifier))

(def cts-modifier (.-ctsModifier typescript/ScriptElementKindModifier))

(def cjs-modifier (.-cjsModifier typescript/ScriptElementKindModifier))
